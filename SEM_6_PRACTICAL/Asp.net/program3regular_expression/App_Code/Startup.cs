using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program3regular_expression.Startup))]
namespace program3regular_expression
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
