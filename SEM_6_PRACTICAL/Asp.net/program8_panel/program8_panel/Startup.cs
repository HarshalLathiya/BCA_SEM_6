using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program8_panel.Startup))]
namespace program8_panel
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
