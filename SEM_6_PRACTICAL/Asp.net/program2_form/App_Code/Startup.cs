using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program2_form.Startup))]
namespace program2_form
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
